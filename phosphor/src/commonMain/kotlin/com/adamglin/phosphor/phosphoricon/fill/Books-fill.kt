package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Books-fill`: ImageVector
    get() {
        if (`_books-fill` != null) {
            return `_books-fill`!!
        }
        `_books-fill` = Builder(name = "Books-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.65f, 194.55f)
                lineTo(198.46f, 36.75f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -19.0f, -12.39f)
                lineTo(132.65f, 34.42f)
                arcToRelative(16.08f, 16.08f, 0.0f, false, false, -12.3f, 19.0f)
                lineToRelative(33.19f, 157.8f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 169.16f, 224.0f)
                arcToRelative(16.25f, 16.25f, 0.0f, false, false, 3.38f, -0.36f)
                lineToRelative(46.81f, -10.06f)
                arcTo(16.09f, 16.09f, 0.0f, false, false, 231.65f, 194.55f)
                close()
                moveTo(136.0f, 50.15f)
                curveToRelative(0.0f, -0.06f, 0.0f, -0.09f, 0.0f, -0.09f)
                lineToRelative(46.8f, -10.0f)
                lineToRelative(3.33f, 15.87f)
                lineTo(139.33f, 66.0f)
                close()
                moveTo(146.0f, 97.53f)
                lineTo(142.65f, 81.63f)
                lineTo(189.47f, 71.57f)
                lineTo(192.81f, 87.47f)
                close()
                moveTo(216.0f, 197.94f)
                lineTo(169.2f, 207.94f)
                lineTo(165.87f, 192.07f)
                lineTo(212.67f, 182.0f)
                lineTo(216.0f, 197.85f)
                curveTo(216.0f, 197.91f, 216.0f, 197.94f, 216.0f, 197.94f)
                close()
                moveTo(104.0f, 32.0f)
                lineTo(56.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 48.0f)
                lineTo(40.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(120.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 104.0f, 32.0f)
                close()
                moveTo(56.0f, 48.0f)
                horizontalLineToRelative(48.0f)
                lineTo(104.0f, 64.0f)
                lineTo(56.0f, 64.0f)
                close()
                moveTo(104.0f, 208.0f)
                lineTo(56.0f, 208.0f)
                lineTo(56.0f, 192.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return `_books-fill`!!
    }

private var `_books-fill`: ImageVector? = null
