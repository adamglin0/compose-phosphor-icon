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

public val ThinGroup.`Lego-smiley-thin`: ImageVector
    get() {
        if (`_lego-smiley-thin` != null) {
            return `_lego-smiley-thin`!!
        }
        `_lego-smiley-thin` = Builder(name = "Lego-smiley-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 100.0f, 120.0f)
                close()
                moveTo(156.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 156.0f, 104.0f)
                close()
                moveTo(153.87f, 148.62f)
                arcToRelative(49.0f, 49.0f, 0.0f, false, true, -51.74f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.26f, 6.77f)
                arcToRelative(57.0f, 57.0f, 0.0f, false, false, 60.26f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.26f, -6.76f)
                close()
                moveTo(212.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -24.0f, 27.71f)
                lineTo(188.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(80.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(68.0f, 203.71f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 44.0f, 176.0f)
                lineTo(44.0f, 80.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 72.0f, 52.0f)
                lineTo(92.0f, 52.0f)
                lineTo(92.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                lineTo(164.0f, 52.0f)
                horizontalLineToRelative(20.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 212.0f, 80.0f)
                close()
                moveTo(100.0f, 52.0f)
                horizontalLineToRelative(56.0f)
                lineTo(156.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(104.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                close()
                moveTo(180.0f, 224.0f)
                lineTo(180.0f, 204.0f)
                lineTo(76.0f, 204.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 180.0f, 224.0f)
                close()
                moveTo(204.0f, 80.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(72.0f, 60.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 52.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(184.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                close()
            }
        }
        .build()
        return `_lego-smiley-thin`!!
    }

private var `_lego-smiley-thin`: ImageVector? = null
