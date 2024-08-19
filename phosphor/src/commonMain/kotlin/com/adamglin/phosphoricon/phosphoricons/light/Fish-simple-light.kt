package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Fish-simple-light`: ImageVector
    get() {
        if (`_fish-simple-light` != null) {
            return `_fish-simple-light`!!
        }
        `_fish-simple-light` = Builder(name = "Fish-simple-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.0f, 76.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 166.0f, 76.0f)
                close()
                moveTo(208.38f, 153.9f)
                curveToRelative(-14.79f, 20.44f, -36.84f, 34.22f, -65.53f, 41.0f)
                curveToRelative(-20.5f, 4.81f, -44.58f, 6.0f, -72.0f, 3.68f)
                quadToRelative(2.43f, 19.0f, 7.07f, 40.15f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.58f, 7.15f)
                arcToRelative(6.29f, 6.29f, 0.0f, false, true, -1.29f, 0.14f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.85f, -4.72f)
                quadToRelative(-5.07f, -23.13f, -7.57f, -44.0f)
                quadToRelative(-20.8f, -2.51f, -43.94f, -7.57f)
                arcTo(6.0f, 6.0f, 0.0f, true, true, 17.29f, 178.0f)
                quadToRelative(21.14f, 4.63f, 40.12f, 7.07f)
                curveToRelative(-2.35f, -27.36f, -1.13f, -51.41f, 3.69f, -71.9f)
                curveTo(67.84f, 84.49f, 81.61f, 62.44f, 102.0f, 47.64f)
                curveToRelative(47.55f, -34.44f, 116.31f, -18.0f, 120.0f, -15.81f)
                arcToRelative(5.93f, 5.93f, 0.0f, false, true, 2.11f, 2.11f)
                curveTo(226.34f, 37.63f, 242.81f, 106.33f, 208.37f, 153.91f)
                close()
                moveTo(190.44f, 156.59f)
                arcToRelative(110.06f, 110.06f, 0.0f, false, true, -91.0f, -91.0f)
                curveToRelative(-25.13f, 24.7f, -35.12f, 65.24f, -29.87f, 120.89f)
                curveTo(125.19f, 191.71f, 165.72f, 181.73f, 190.43f, 156.6f)
                close()
                moveTo(214.06f, 41.93f)
                curveToRelative(-12.78f, -2.84f, -65.42f, -12.17f, -103.69f, 14.52f)
                arcToRelative(97.92f, 97.92f, 0.0f, false, false, 89.16f, 89.17f)
                curveTo(226.21f, 107.37f, 216.89f, 54.72f, 214.06f, 41.93f)
                close()
            }
        }
        .build()
        return `_fish-simple-light`!!
    }

private var `_fish-simple-light`: ImageVector? = null
