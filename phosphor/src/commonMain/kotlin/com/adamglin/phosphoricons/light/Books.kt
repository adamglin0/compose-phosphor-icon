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

public val LightGroup.Books: ImageVector
    get() {
        if (_books != null) {
            return _books!!
        }
        _books = Builder(name = "Books", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 34.0f)
                lineTo(56.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 48.0f)
                lineTo(42.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(118.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 104.0f, 34.0f)
                close()
                moveTo(54.0f, 78.0f)
                horizontalLineToRelative(52.0f)
                lineTo(106.0f, 178.0f)
                lineTo(54.0f, 178.0f)
                close()
                moveTo(56.0f, 46.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(106.0f, 66.0f)
                lineTo(54.0f, 66.0f)
                lineTo(54.0f, 48.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 56.0f, 46.0f)
                close()
                moveTo(104.0f, 210.0f)
                lineTo(56.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(54.0f, 190.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 104.0f, 210.0f)
                close()
                moveTo(229.7f, 195.0f)
                lineTo(196.51f, 37.16f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -16.63f, -10.85f)
                lineTo(133.07f, 36.37f)
                arcTo(14.09f, 14.09f, 0.0f, false, false, 122.3f, 53.0f)
                lineToRelative(33.19f, 157.81f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 6.1f, 8.9f)
                arcToRelative(13.85f, 13.85f, 0.0f, false, false, 7.57f, 2.26f)
                arcToRelative(13.55f, 13.55f, 0.0f, false, false, 3.0f, -0.32f)
                lineToRelative(46.81f, -10.05f)
                arcTo(14.09f, 14.09f, 0.0f, false, false, 229.7f, 195.0f)
                close()
                moveTo(146.89f, 111.68f)
                lineTo(197.62f, 100.78f)
                lineTo(211.74f, 167.94f)
                lineTo(161.0f, 178.81f)
                close()
                moveTo(140.26f, 80.12f)
                lineTo(191.0f, 69.19f)
                lineTo(195.15f, 89.0f)
                lineToRelative(-50.73f, 10.9f)
                close()
                moveTo(135.6f, 48.12f)
                lineTo(182.4f, 38.07f)
                arcToRelative(2.18f, 2.18f, 0.0f, false, true, 0.42f, 0.0f)
                arcToRelative(1.89f, 1.89f, 0.0f, false, true, 1.05f, 0.32f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.89f, 1.31f)
                lineToRelative(3.75f, 17.82f)
                lineTo(137.79f, 68.34f)
                lineToRelative(-3.74f, -17.78f)
                arcTo(2.07f, 2.07f, 0.0f, false, true, 135.6f, 48.1f)
                close()
                moveTo(216.41f, 199.92f)
                lineTo(169.6f, 210.0f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, true, -1.47f, -0.27f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.89f, -1.31f)
                lineToRelative(-3.75f, -17.82f)
                lineToRelative(50.72f, -10.9f)
                lineTo(218.0f, 197.43f)
                arcTo(2.07f, 2.07f, 0.0f, false, true, 216.41f, 199.9f)
                close()
            }
        }
        .build()
        return _books!!
    }

private var _books: ImageVector? = null
