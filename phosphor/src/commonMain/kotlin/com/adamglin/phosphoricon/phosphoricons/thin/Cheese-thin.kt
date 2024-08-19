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

public val ThinGroup.`Cheese-thin`: ImageVector
    get() {
        if (`_cheese-thin` != null) {
            return `_cheese-thin`!!
        }
        `_cheese-thin` = Builder(name = "Cheese-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 36.0f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, false, -1.15f, 0.17f)
                lineToRelative(-160.0f, 48.0f)
                verticalLineToRelative(0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 20.0f, 88.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(20.11f, 20.11f, 0.0f, false, true, 20.0f, 19.61f)
                arcToRelative(19.59f, 19.59f, 0.0f, false, true, -5.72f, 14.14f)
                arcTo(20.92f, 20.92f, 0.0f, false, true, 31.46f, 156.0f)
                lineTo(24.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(224.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 88.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, false, 184.0f, 36.0f)
                close()
                moveTo(184.57f, 44.0f)
                arcToRelative(44.06f, 44.06f, 0.0f, false, true, 43.24f, 40.0f)
                lineTo(51.25f, 84.0f)
                close()
                moveTo(196.0f, 104.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -53.29f, -12.0f)
                horizontalLineToRelative(50.58f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 196.0f, 104.0f)
                close()
                moveTo(140.0f, 188.0f)
                lineTo(84.0f, 188.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                close()
                moveTo(228.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(148.0f, 188.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -72.0f, 0.0f)
                verticalLineToRelative(4.0f)
                lineTo(28.0f, 188.0f)
                lineTo(28.0f, 164.0f)
                horizontalLineToRelative(3.46f)
                arcTo(29.0f, 29.0f, 0.0f, false, false, 52.0f, 155.35f)
                arcToRelative(27.52f, 27.52f, 0.0f, false, false, 8.0f, -19.89f)
                arcTo(28.14f, 28.14f, 0.0f, false, false, 32.0f, 108.0f)
                lineTo(28.0f, 108.0f)
                lineTo(28.0f, 92.0f)
                lineTo(134.07f, 92.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 67.86f, 0.0f)
                lineTo(228.0f, 92.0f)
                close()
            }
        }
        .build()
        return `_cheese-thin`!!
    }

private var `_cheese-thin`: ImageVector? = null
