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

public val LightGroup.`Bowl-food-light`: ImageVector
    get() {
        if (`_bowl-food-light` != null) {
            return `_bowl-food-light`!!
        }
        `_bowl-food-light` = Builder(name = "Bowl-food-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 106.0f)
                lineTo(213.77f, 106.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, -171.54f, 0.0f)
                lineTo(32.0f, 106.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                arcToRelative(102.35f, 102.35f, 0.0f, false, false, 56.0f, 91.06f)
                lineTo(82.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineToRelative(-4.94f)
                arcTo(102.35f, 102.35f, 0.0f, false, false, 230.0f, 112.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 106.0f)
                close()
                moveTo(174.24f, 54.29f)
                arcToRelative(74.15f, 74.15f, 0.0f, false, true, 8.15f, 7.6f)
                arcTo(85.89f, 85.89f, 0.0f, false, false, 130.84f, 106.0f)
                lineTo(97.34f, 106.0f)
                arcTo(74.24f, 74.24f, 0.0f, false, true, 168.0f, 54.0f)
                curveTo(170.08f, 54.0f, 172.17f, 54.11f, 174.24f, 54.29f)
                close()
                moveTo(190.3f, 72.14f)
                arcTo(73.49f, 73.49f, 0.0f, false, true, 201.74f, 106.0f)
                lineTo(144.48f, 106.0f)
                arcTo(73.89f, 73.89f, 0.0f, false, true, 190.3f, 72.14f)
                close()
                moveTo(128.0f, 38.0f)
                arcToRelative(73.68f, 73.68f, 0.0f, false, true, 26.8f, 5.0f)
                arcToRelative(86.32f, 86.32f, 0.0f, false, false, -69.94f, 63.0f)
                lineTo(54.26f, 106.0f)
                arcTo(74.09f, 74.09f, 0.0f, false, true, 128.0f, 38.0f)
                close()
                moveTo(165.5f, 193.84f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.5f, 5.46f)
                lineTo(162.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(96.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-8.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.5f, -5.46f)
                arcTo(90.35f, 90.35f, 0.0f, false, true, 38.2f, 118.0f)
                lineTo(217.8f, 118.0f)
                arcTo(90.35f, 90.35f, 0.0f, false, true, 165.5f, 193.84f)
                close()
            }
        }
        .build()
        return `_bowl-food-light`!!
    }

private var `_bowl-food-light`: ImageVector? = null
