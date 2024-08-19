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

public val ThinGroup.`Highlighter-circle-thin`: ImageVector
    get() {
        if (`_highlighter-circle-thin` != null) {
            return `_highlighter-circle-thin`!!
        }
        `_highlighter-circle-thin` = Builder(name = "Highlighter-circle-thin", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.71f, 57.29f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 57.29f, 198.71f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 198.71f, 57.29f)
                close()
                moveTo(92.0f, 212.7f)
                lineTo(92.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(60.7f)
                arcToRelative(92.42f, 92.42f, 0.0f, false, true, -72.0f, 0.0f)
                close()
                moveTo(148.0f, 140.0f)
                lineTo(108.0f, 140.0f)
                lineTo(108.0f, 98.47f)
                lineToRelative(40.0f, -20.0f)
                close()
                moveTo(193.05f, 193.05f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 172.0f, 208.83f)
                lineTo(172.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(156.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.79f, -3.58f)
                lineToRelative(-48.0f, 24.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 100.0f, 96.0f)
                verticalLineToRelative(44.0f)
                lineTo(96.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(56.83f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 109.05f, -15.78f)
                close()
            }
        }
        .build()
        return `_highlighter-circle-thin`!!
    }

private var `_highlighter-circle-thin`: ImageVector? = null
