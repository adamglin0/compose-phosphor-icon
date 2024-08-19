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

public val ThinGroup.`Paper-plane-thin`: ImageVector
    get() {
        if (`_paper-plane-thin` != null) {
            return `_paper-plane-thin`!!
        }
        `_paper-plane-thin` = Builder(name = "Paper-plane-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.43f, 202.08f)
                lineTo(138.35f, 34.14f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.92f, 0.0f)
                lineToRelative(-95.88f, 168.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 219.3f)
                lineToRelative(92.0f, -31.08f)
                lineToRelative(91.94f, 31.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.49f, -17.2f)
                close()
                moveTo(227.0f, 210.56f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, -4.47f, 1.16f)
                lineTo(132.0f, 181.13f)
                verticalLineTo(120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(61.13f)
                lineTo(33.37f, 211.74f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.85f, -5.69f)
                lineToRelative(95.87f, -168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.0f, 0.0f)
                lineTo(227.47f, 206.0f)
                arcTo(3.91f, 3.91f, 0.0f, false, true, 227.0f, 210.56f)
                close()
            }
        }
        .build()
        return `_paper-plane-thin`!!
    }

private var `_paper-plane-thin`: ImageVector? = null
