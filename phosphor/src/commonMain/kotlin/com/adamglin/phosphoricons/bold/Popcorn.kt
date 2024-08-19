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

public val BoldGroup.Popcorn: ImageVector
    get() {
        if (_popcorn != null) {
            return _popcorn!!
        }
        _popcorn = Builder(name = "Popcorn", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.28f, 71.32f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.0f, -3.25f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -55.19f, -31.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -84.24f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -55.19f, 31.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.32f, 82.75f)
                lineTo(50.87f, 212.58f)
                arcTo(19.92f, 19.92f, 0.0f, false, false, 70.34f, 228.0f)
                lineTo(185.66f, 228.0f)
                arcToRelative(19.92f, 19.92f, 0.0f, false, false, 19.47f, -15.42f)
                lineTo(235.68f, 82.75f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.28f, 71.32f)
                close()
                moveTo(76.0f, 60.0f)
                arcToRelative(23.68f, 23.68f, 0.0f, false, true, 11.23f, 2.79f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.35f, -8.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 46.84f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.35f, 8.0f)
                arcTo(23.68f, 23.68f, 0.0f, false, true, 180.0f, 60.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 21.78f, 13.87f)
                lineToRelative(-33.13f, 9.46f)
                lineTo(135.43f, 70.05f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, false, -14.86f, 0.0f)
                lineTo(87.35f, 83.33f)
                lineTo(54.22f, 73.87f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 76.0f, 60.0f)
                close()
                moveTo(101.13f, 103.67f)
                lineTo(128.0f, 92.92f)
                lineToRelative(26.87f, 10.75f)
                lineTo(141.49f, 204.0f)
                horizontalLineToRelative(-27.0f)
                close()
                moveTo(48.36f, 97.16f)
                lineToRelative(28.78f, 8.22f)
                lineTo(90.29f, 204.0f)
                lineTo(73.5f, 204.0f)
                close()
                moveTo(182.5f, 204.0f)
                lineTo(165.71f, 204.0f)
                lineToRelative(13.15f, -98.62f)
                lineToRelative(28.78f, -8.22f)
                close()
            }
        }
        .build()
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
