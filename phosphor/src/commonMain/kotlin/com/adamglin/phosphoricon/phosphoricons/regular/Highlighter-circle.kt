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

public val RegularGroup.`Highlighter-circle`: ImageVector
    get() {
        if (`_highlighter-circle` != null) {
            return `_highlighter-circle`!!
        }
        `_highlighter-circle` = Builder(name = "Highlighter-circle", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.54f, 54.46f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 54.46f, 201.54f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 201.54f, 54.46f)
                close()
                moveTo(96.0f, 210.0f)
                lineTo(96.0f, 152.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(58.0f)
                arcToRelative(88.33f, 88.33f, 0.0f, false, true, -64.0f, 0.0f)
                close()
                moveTo(144.0f, 136.0f)
                lineTo(112.0f, 136.0f)
                lineTo(112.0f, 100.94f)
                lineToRelative(32.0f, -16.0f)
                close()
                moveTo(190.22f, 190.22f)
                arcTo(88.09f, 88.09f, 0.0f, false, true, 176.0f, 201.77f)
                lineTo(176.0f, 152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(160.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.58f, -7.16f)
                lineToRelative(-48.0f, 24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 96.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(49.77f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 110.22f, -11.55f)
                close()
            }
        }
        .build()
        return `_highlighter-circle`!!
    }

private var `_highlighter-circle`: ImageVector? = null
