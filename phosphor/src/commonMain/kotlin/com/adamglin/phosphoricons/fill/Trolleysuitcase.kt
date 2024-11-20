package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.TrolleySuitcase: ImageVector
    get() {
        if (_trolleySuitcase != null) {
            return _trolleySuitcase!!
        }
        _trolleySuitcase = Builder(name = "TrolleySuitcase", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 88.0f, 224.0f)
                close()
                moveTo(216.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 208.0f)
                close()
                moveTo(240.0f, 176.0f)
                lineTo(56.0f, 176.0f)
                lineTo(56.0f, 75.31f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 51.31f, 64.0f)
                lineTo(29.66f, 42.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 18.34f, 53.66f)
                lineTo(40.0f, 75.31f)
                lineTo(40.0f, 176.0f)
                lineTo(32.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(240.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(72.0f, 144.0f)
                lineTo(72.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 88.0f, 56.0f)
                horizontalLineToRelative(32.0f)
                lineTo(120.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                lineTo(184.0f, 56.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(88.0f, 160.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 72.0f, 144.0f)
                close()
                moveTo(136.0f, 56.0f)
                horizontalLineToRelative(32.0f)
                lineTo(168.0f, 40.0f)
                lineTo(136.0f, 40.0f)
                close()
            }
        }
        .build()
        return _trolleySuitcase!!
    }

private var _trolleySuitcase: ImageVector? = null
