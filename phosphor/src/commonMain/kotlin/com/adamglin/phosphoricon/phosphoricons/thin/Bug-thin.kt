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

public val ThinGroup.`Bug-thin`: ImageVector
    get() {
        if (`_bug-thin` != null) {
            return `_bug-thin`!!
        }
        `_bug-thin` = Builder(name = "Bug-thin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 92.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 148.0f, 92.0f)
                close()
                moveTo(100.0f, 84.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 100.0f, 84.0f)
                close()
                moveTo(244.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(212.0f, 132.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(83.64f, 83.64f, 0.0f, false, true, -3.87f, 25.2f)
                lineToRelative(25.47f, 11.13f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 232.0f, 188.0f)
                arcToRelative(4.09f, 4.09f, 0.0f, false, true, -1.6f, -0.33f)
                lineToRelative(-25.0f, -10.95f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, -154.72f, 0.0f)
                lineToRelative(-25.0f, 10.95f)
                arcTo(4.09f, 4.09f, 0.0f, false, true, 24.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.6f, -7.67f)
                lineTo(47.87f, 169.2f)
                arcTo(83.64f, 83.64f, 0.0f, false, true, 44.0f, 144.0f)
                lineTo(44.0f, 132.0f)
                lineTo(16.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(44.0f, 124.0f)
                lineTo(44.0f, 112.0f)
                arcToRelative(83.64f, 83.64f, 0.0f, false, true, 3.87f, -25.2f)
                lineTo(22.4f, 75.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.2f, -7.34f)
                lineToRelative(25.0f, 11.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 154.72f, 0.0f)
                lineToRelative(25.0f, -11.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 3.2f, 7.34f)
                lineTo(208.13f, 86.8f)
                arcTo(83.64f, 83.64f, 0.0f, false, true, 212.0f, 112.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(28.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 128.0f)
                close()
                moveTo(52.0f, 124.0f)
                lineTo(204.0f, 124.0f)
                lineTo(204.0f, 112.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -152.0f, 0.0f)
                close()
                moveTo(124.0f, 219.89f)
                lineTo(124.0f, 132.0f)
                lineTo(52.0f, 132.0f)
                verticalLineToRelative(12.0f)
                arcTo(76.09f, 76.09f, 0.0f, false, false, 124.0f, 219.89f)
                close()
                moveTo(204.0f, 132.0f)
                lineTo(132.0f, 132.0f)
                verticalLineToRelative(87.89f)
                arcTo(76.09f, 76.09f, 0.0f, false, false, 204.0f, 144.0f)
                close()
            }
        }
        .build()
        return `_bug-thin`!!
    }

private var `_bug-thin`: ImageVector? = null
