package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Fish-simple`: ImageVector
    get() {
        if (`_fish-simple` != null) {
            return `_fish-simple`!!
        }
        `_fish-simple` = Builder(name = "Fish-simple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.0f, 76.0f)
                close()
                moveTo(210.0f, 155.08f)
                curveToRelative(-15.08f, 20.84f, -37.53f, 34.88f, -66.7f, 41.74f)
                curveToRelative(-20.08f, 4.72f, -43.54f, 6.0f, -70.12f, 3.93f)
                quadToRelative(2.4f, 17.82f, 6.72f, 37.54f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.1f, 9.52f)
                arcToRelative(7.81f, 7.81f, 0.0f, false, true, -1.72f, 0.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.81f, -6.29f)
                quadToRelative(-4.89f, -22.36f, -7.41f, -42.62f)
                quadToRelative(-20.22f, -2.51f, -42.58f, -7.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.43f, -15.63f)
                quadToRelative(19.7f, 4.32f, 37.5f, 6.73f)
                curveToRelative(-2.09f, -26.56f, -0.78f, -50.0f, 3.93f, -70.06f)
                curveTo(66.0f, 83.55f, 80.05f, 61.1f, 100.88f, 46.0f)
                curveTo(115.0f, 35.76f, 140.15f, 23.64f, 179.27f, 24.0f)
                curveToRelative(21.19f, 0.21f, 40.83f, 4.33f, 43.81f, 6.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.83f, 2.83f)
                curveToRelative(1.75f, 3.0f, 5.87f, 22.59f, 6.08f, 43.78f)
                curveTo(232.21f, 98.31f, 228.57f, 129.44f, 210.0f, 155.08f)
                close()
                moveTo(186.24f, 157.88f)
                arcTo(112.07f, 112.07f, 0.0f, false, true, 98.12f, 69.74f)
                curveTo(75.64f, 94.0f, 66.7f, 132.47f, 71.36f, 184.6f)
                curveTo(123.51f, 189.28f, 162.0f, 180.35f, 186.25f, 157.88f)
                close()
                moveTo(212.44f, 43.56f)
                arcToRelative(175.75f, 175.75f, 0.0f, false, false, -39.22f, -3.51f)
                curveToRelative(-24.34f, 0.64f, -44.71f, 6.49f, -60.76f, 17.39f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, 86.09f, 86.1f)
                curveToRelative(10.91f, -16.0f, 16.76f, -36.42f, 17.4f, -60.76f)
                arcTo(175.82f, 175.82f, 0.0f, false, false, 212.44f, 43.56f)
                close()
            }
        }
        .build()
        return `_fish-simple`!!
    }

private var `_fish-simple`: ImageVector? = null
