package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Recycle: ImageVector
    get() {
        if (_recycle != null) {
            return _recycle!!
        }
        _recycle = Builder(name = "Recycle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(94.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(40.0f, 214.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -19.0f, -33.0f)
                lineToRelative(36.71f, -63.44f)
                lineToRelative(-18.76f, 5.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.1f, -11.6f)
                lineToRelative(32.77f, -8.77f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 76.0f, 106.45f)
                lineToRelative(8.8f, 32.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.24f, 7.35f)
                arcToRelative(6.09f, 6.09f, 0.0f, false, true, -1.56f, 0.21f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.79f, -4.45f)
                lineToRelative(-5.0f, -18.8f)
                lineTo(31.38f, 187.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 40.0f, 202.0f)
                lineTo(88.0f, 202.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 94.0f, 208.0f)
                close()
                moveTo(235.0f, 181.0f)
                lineTo(211.86f, 141.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.38f, 6.0f)
                lineToRelative(23.14f, 40.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 216.0f, 202.0f)
                lineTo(142.48f, 202.0f)
                lineToRelative(13.76f, -13.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 8.48f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                lineTo(142.48f, 214.0f)
                lineTo(216.0f, 214.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 19.0f, -33.0f)
                close()
                moveTo(136.65f, 35.0f)
                lineToRelative(36.72f, 63.44f)
                lineToRelative(-18.76f, -5.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 151.5f, 105.0f)
                lineToRelative(32.78f, 8.79f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.34f, -4.25f)
                lineToRelative(8.79f, -32.78f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -11.58f, -3.11f)
                lineToRelative(-5.05f, 18.82f)
                lineTo(147.0f, 29.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 109.0f, 29.0f)
                lineTo(85.8f, 69.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.39f, 6.0f)
                lineToRelative(23.16f, -40.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 17.3f, 0.0f)
                close()
            }
        }
        .build()
        return _recycle!!
    }

private var _recycle: ImageVector? = null
