package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Eyedropper: ImageVector
    get() {
        if (_eyedropper != null) {
            return _eyedropper!!
        }
        _eyedropper = Builder(name = "Eyedropper", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 67.3f)
                arcToRelative(35.79f, 35.79f, 0.0f, false, false, -11.26f, -25.66f)
                curveToRelative(-14.0f, -13.28f, -36.72f, -12.78f, -50.62f, 1.13f)
                lineTo(142.8f, 62.2f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -33.14f, 0.77f)
                lineToRelative(-9.0f, 9.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.64f)
                lineToRelative(2.0f, 2.06f)
                lineToRelative(-51.0f, 51.0f)
                arcToRelative(39.75f, 39.75f, 0.0f, false, false, -10.53f, 38.0f)
                lineToRelative(-8.0f, 18.41f)
                arcTo(13.68f, 13.68f, 0.0f, false, false, 36.0f, 219.3f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, false, 17.71f, 3.35f)
                lineTo(71.23f, 215.0f)
                arcToRelative(39.89f, 39.89f, 0.0f, false, false, 37.06f, -10.75f)
                lineToRelative(51.0f, -51.0f)
                lineToRelative(2.06f, 2.06f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.62f, 0.0f)
                lineToRelative(9.0f, -9.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.74f, -33.18f)
                lineToRelative(19.75f, -19.87f)
                arcTo(35.75f, 35.75f, 0.0f, false, false, 224.0f, 67.3f)
                close()
                moveTo(97.0f, 193.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 6.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.55f, 0.31f)
                lineToRelative(-18.1f, 7.91f)
                lineTo(57.0f, 189.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.25f, -5.75f)
                arcTo(23.88f, 23.88f, 0.0f, false, true, 63.0f, 159.0f)
                lineToRelative(51.0f, -51.0f)
                lineToRelative(33.94f, 34.0f)
                close()
                moveTo(202.13f, 82.0f)
                lineToRelative(-25.37f, 25.52f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.3f)
                lineToRelative(4.89f, 4.89f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-9.0f, 9.0f)
                lineTo(112.0f, 83.26f)
                lineToRelative(9.0f, -9.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.31f, 0.0f)
                lineToRelative(4.89f, 4.89f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.33f, 0.0f)
                lineToRelative(24.94f, -25.09f)
                curveToRelative(7.81f, -7.82f, 20.5f, -8.18f, 28.29f, -0.81f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.39f, 28.7f)
                close()
            }
        }
        .build()
        return _eyedropper!!
    }

private var _eyedropper: ImageVector? = null
