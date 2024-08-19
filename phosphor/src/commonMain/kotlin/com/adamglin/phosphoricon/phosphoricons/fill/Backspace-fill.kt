package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Backspace-fill`: ImageVector
    get() {
        if (`_backspace-fill` != null) {
            return `_backspace-fill`!!
        }
        `_backspace-fill` = Builder(name = "Backspace-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                horizontalLineTo(68.53f)
                arcToRelative(16.12f, 16.12f, 0.0f, false, false, -13.72f, 7.77f)
                lineTo(9.14f, 123.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 8.24f)
                lineToRelative(45.67f, 76.11f)
                horizontalLineToRelative(0.0f)
                arcTo(16.11f, 16.11f, 0.0f, false, false, 68.53f, 216.0f)
                horizontalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(165.66f, 146.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(136.0f, 139.31f)
                lineToRelative(-18.35f, 18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, -11.32f)
                lineTo(124.69f, 128.0f)
                lineToRelative(-18.35f, -18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.31f, -11.32f)
                lineTo(136.0f, 116.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(147.31f, 128.0f)
                close()
            }
        }
        .build()
        return `_backspace-fill`!!
    }

private var `_backspace-fill`: ImageVector? = null
