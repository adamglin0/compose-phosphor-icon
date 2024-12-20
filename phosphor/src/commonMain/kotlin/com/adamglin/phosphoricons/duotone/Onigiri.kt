package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Onigiri: ImageVector
    get() {
        if (_onigiri != null) {
            return _onigiri!!
        }
        _onigiri = Builder(name = "Onigiri", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(168.0f, 168.0f)
                verticalLineToRelative(56.0f)
                horizontalLineTo(88.0f)
                verticalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 168.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.53f, 146.57f)
                lineTo(175.68f, 50.66f)
                lineToRelative(-0.11f, -0.19f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -95.14f, 0.0f)
                lineToRelative(-0.11f, 0.19f)
                lineTo(24.47f, 146.57f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 72.09f, 232.0f)
                lineTo(183.91f, 232.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 47.62f, -85.43f)
                close()
                moveTo(160.0f, 216.0f)
                lineTo(96.0f, 216.0f)
                lineTo(96.0f, 168.0f)
                horizontalLineToRelative(64.0f)
                close()
                moveTo(218.86f, 195.45f)
                arcTo(39.49f, 39.49f, 0.0f, false, true, 183.91f, 216.0f)
                lineTo(176.0f, 216.0f)
                lineTo(176.0f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(96.0f, 152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                lineTo(72.09f, 216.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -34.0f, -61.09f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.11f, -0.2f)
                lineToRelative(55.85f, -95.9f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 67.84f, 0.0f)
                lineToRelative(55.85f, 95.9f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.11f, 0.2f)
                arcTo(39.5f, 39.5f, 0.0f, false, true, 218.85f, 195.45f)
                close()
            }
        }
        .build()
        return _onigiri!!
    }

private var _onigiri: ImageVector? = null
