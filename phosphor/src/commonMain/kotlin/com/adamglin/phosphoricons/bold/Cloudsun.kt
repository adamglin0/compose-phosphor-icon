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

public val BoldGroup.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) {
            return _cloudSun!!
        }
        _cloudSun = Builder(name = "CloudSun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 68.0f)
                arcToRelative(80.39f, 80.39f, 0.0f, false, false, -18.46f, 2.15f)
                arcToRelative(59.87f, 59.87f, 0.0f, false, false, -6.0f, -7.42f)
                lineToRelative(7.57f, -10.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.66f, -13.77f)
                lineTo(119.87f, 49.0f)
                arcTo(59.85f, 59.85f, 0.0f, false, false, 97.61f, 44.0f)
                lineToRelative(-2.3f, -13.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.63f, 4.17f)
                lineToRelative(2.3f, 13.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 54.77f, 60.47f)
                lineTo(43.91f, 52.86f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 30.14f, 72.52f)
                lineTo(41.0f, 80.11f)
                arcTo(59.45f, 59.45f, 0.0f, false, false, 36.0f, 102.36f)
                lineToRelative(-13.0f, 2.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.07f, 23.82f)
                arcToRelative(12.59f, 12.59f, 0.0f, false, false, 2.1f, -0.18f)
                lineToRelative(13.0f, -2.3f)
                arcToRelative(59.29f, 59.29f, 0.0f, false, false, 3.44f, 7.25f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 84.0f, 228.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 0.0f, -160.0f)
                close()
                moveTo(96.0f, 68.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 26.45f, 11.61f)
                arcToRelative(80.37f, 80.37f, 0.0f, false, false, -32.06f, 36.75f)
                arcTo(56.5f, 56.5f, 0.0f, false, false, 84.0f, 116.0f)
                arcToRelative(55.84f, 55.84f, 0.0f, false, false, -20.33f, 3.83f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 96.0f, 68.0f)
                close()
                moveTo(164.0f, 204.0f)
                lineTo(84.0f, 204.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, -64.0f)
                horizontalLineToRelative(0.28f)
                curveToRelative(-0.11f, 1.1f, -0.2f, 2.2f, -0.26f, 3.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 1.4f)
                arcToRelative(55.78f, 55.78f, 0.0f, false, true, 1.74f, -11.0f)
                lineToRelative(0.15f, -0.55f)
                arcTo(56.06f, 56.06f, 0.0f, true, true, 164.0f, 204.0f)
                close()
            }
        }
        .build()
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
