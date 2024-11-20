package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.WarningOctagon: ImageVector
    get() {
        if (_warningOctagon != null) {
            return _warningOctagon!!
        }
        _warningOctagon = Builder(name = "WarningOctagon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 132.0f)
                lineTo(116.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(236.0f, 91.55f)
                verticalLineToRelative(72.9f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, true, -5.86f, 14.14f)
                lineToRelative(-51.55f, 51.55f)
                arcTo(19.85f, 19.85f, 0.0f, false, true, 164.45f, 236.0f)
                lineTo(91.55f, 236.0f)
                arcToRelative(19.85f, 19.85f, 0.0f, false, true, -14.14f, -5.86f)
                lineTo(25.86f, 178.59f)
                arcTo(19.86f, 19.86f, 0.0f, false, true, 20.0f, 164.45f)
                lineTo(20.0f, 91.55f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, true, 5.86f, -14.14f)
                lineTo(77.41f, 25.86f)
                arcTo(19.85f, 19.85f, 0.0f, false, true, 91.55f, 20.0f)
                horizontalLineToRelative(72.9f)
                arcToRelative(19.85f, 19.85f, 0.0f, false, true, 14.14f, 5.86f)
                lineToRelative(51.55f, 51.55f)
                arcTo(19.86f, 19.86f, 0.0f, false, true, 236.0f, 91.55f)
                close()
                moveTo(212.0f, 93.21f)
                lineTo(162.79f, 44.0f)
                lineTo(93.21f, 44.0f)
                lineTo(44.0f, 93.21f)
                verticalLineToRelative(69.58f)
                lineTo(93.21f, 212.0f)
                horizontalLineToRelative(69.58f)
                lineTo(212.0f, 162.79f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 156.0f)
                close()
            }
        }
        .build()
        return _warningOctagon!!
    }

private var _warningOctagon: ImageVector? = null
