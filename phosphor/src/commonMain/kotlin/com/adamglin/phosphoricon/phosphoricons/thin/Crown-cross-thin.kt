package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Crown-cross-thin`: ImageVector
    get() {
        if (`_crown-cross-thin` != null) {
            return `_crown-cross-thin`!!
        }
        `_crown-cross-thin` = Builder(name = "Crown-cross-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 60.0f)
                curveToRelative(-15.15f, 0.0f, -29.15f, 5.06f, -39.43f, 14.25f)
                arcToRelative(49.31f, 49.31f, 0.0f, false, false, -8.57f, 10.0f)
                lineTo(132.0f, 36.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(132.0f, 28.0f)
                lineTo(132.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(124.0f, 28.0f)
                lineTo(104.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(20.0f)
                lineTo(124.0f, 84.26f)
                arcToRelative(49.31f, 49.31f, 0.0f, false, false, -8.57f, -10.0f)
                curveTo(105.15f, 65.06f, 91.15f, 60.0f, 76.0f, 60.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, 56.0f)
                curveToRelative(0.0f, 28.36f, 13.79f, 46.38f, 25.37f, 56.51f)
                arcTo(85.57f, 85.57f, 0.0f, false, false, 68.0f, 186.74f)
                lineTo(68.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(188.0f, 186.74f)
                arcToRelative(85.57f, 85.57f, 0.0f, false, false, 22.63f, -14.23f)
                curveTo(222.21f, 162.38f, 236.0f, 144.36f, 236.0f, 116.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 180.0f, 60.0f)
                close()
                moveTo(205.59f, 166.29f)
                arcToRelative(75.53f, 75.53f, 0.0f, false, true, -22.85f, 13.92f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 180.0f, 184.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(80.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(76.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.73f, -3.79f)
                arcToRelative(75.38f, 75.38f, 0.0f, false, true, -22.86f, -13.92f)
                curveTo(35.54f, 153.17f, 28.0f, 136.25f, 28.0f, 116.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 76.0f, 68.0f)
                curveToRelative(27.81f, 0.0f, 48.0f, 18.5f, 48.0f, 44.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 112.0f)
                curveToRelative(0.0f, -25.5f, 20.19f, -44.0f, 48.0f, -44.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, 48.0f, 48.0f)
                curveTo(228.0f, 136.25f, 220.46f, 153.17f, 205.59f, 166.29f)
                close()
            }
        }
        .build()
        return `_crown-cross-thin`!!
    }

private var `_crown-cross-thin`: ImageVector? = null
