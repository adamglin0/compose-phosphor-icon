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

public val RegularGroup.`Unite-square`: ImageVector
    get() {
        if (`_unite-square` != null) {
            return `_unite-square`!!
        }
        `_unite-square` = Builder(name = "Unite-square", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 152.0f)
                lineTo(224.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(168.0f, 88.0f)
                lineTo(168.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(40.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(88.0f, 168.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(216.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(224.0f, 152.0f)
                close()
                moveTo(155.31f, 208.0f)
                lineTo(48.0f, 100.69f)
                lineTo(48.0f, 59.31f)
                lineTo(196.69f, 208.0f)
                close()
                moveTo(59.31f, 48.0f)
                horizontalLineToRelative(41.38f)
                lineTo(208.0f, 155.31f)
                verticalLineToRelative(41.38f)
                close()
                moveTo(208.0f, 132.69f)
                lineTo(179.31f, 104.0f)
                lineTo(208.0f, 104.0f)
                close()
                moveTo(152.0f, 76.69f)
                lineTo(123.31f, 48.0f)
                lineTo(152.0f, 48.0f)
                close()
                moveTo(48.0f, 123.31f)
                lineTo(76.69f, 152.0f)
                lineTo(48.0f, 152.0f)
                close()
                moveTo(104.0f, 179.31f)
                lineTo(132.69f, 208.0f)
                lineTo(104.0f, 208.0f)
                close()
            }
        }
        .build()
        return `_unite-square`!!
    }

private var `_unite-square`: ImageVector? = null
