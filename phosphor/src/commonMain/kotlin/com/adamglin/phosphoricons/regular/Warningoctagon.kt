package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.WarningOctagon: ImageVector
    get() {
        if (_warningOctagon != null) {
            return _warningOctagon!!
        }
        _warningOctagon = Builder(name = "WarningOctagon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 136.0f)
                lineTo(120.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(232.0f, 91.55f)
                verticalLineToRelative(72.9f)
                arcToRelative(15.86f, 15.86f, 0.0f, false, true, -4.69f, 11.31f)
                lineToRelative(-51.55f, 51.55f)
                arcTo(15.86f, 15.86f, 0.0f, false, true, 164.45f, 232.0f)
                lineTo(91.55f, 232.0f)
                arcToRelative(15.86f, 15.86f, 0.0f, false, true, -11.31f, -4.69f)
                lineTo(28.69f, 175.76f)
                arcTo(15.86f, 15.86f, 0.0f, false, true, 24.0f, 164.45f)
                lineTo(24.0f, 91.55f)
                arcToRelative(15.86f, 15.86f, 0.0f, false, true, 4.69f, -11.31f)
                lineTo(80.24f, 28.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, true, 91.55f, 24.0f)
                horizontalLineToRelative(72.9f)
                arcToRelative(15.86f, 15.86f, 0.0f, false, true, 11.31f, 4.69f)
                lineToRelative(51.55f, 51.55f)
                arcTo(15.86f, 15.86f, 0.0f, false, true, 232.0f, 91.55f)
                close()
                moveTo(216.0f, 91.55f)
                lineTo(164.45f, 40.0f)
                lineTo(91.55f, 40.0f)
                lineTo(40.0f, 91.55f)
                verticalLineToRelative(72.9f)
                lineTo(91.55f, 216.0f)
                horizontalLineToRelative(72.9f)
                lineTo(216.0f, 164.45f)
                close()
                moveTo(128.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 160.0f)
                close()
            }
        }
        .build()
        return _warningOctagon!!
    }

private var _warningOctagon: ImageVector? = null
