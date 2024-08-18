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

public val FillGroup.`Text-a-underline-fill`: ImageVector
    get() {
        if (`_text-a-underline-fill` != null) {
            return `_text-a-underline-fill`!!
        }
        `_text-a-underline-fill` = Builder(name = "Text-a-underline-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.73f, 120.0f)
                horizontalLineTo(107.27f)
                lineTo(128.0f, 75.09f)
                close()
                moveTo(216.0f, 32.0f)
                verticalLineTo(224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 32.0f)
                close()
                moveTo(76.65f, 167.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.61f, -3.91f)
                lineTo(99.89f, 136.0f)
                horizontalLineToRelative(56.22f)
                lineToRelative(12.63f, 27.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.52f, -6.7f)
                lineToRelative(-48.0f, -104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.52f, 0.0f)
                lineToRelative(-48.0f, 104.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 76.65f, 167.26f)
                close()
                moveTo(200.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(192.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 192.0f)
                close()
            }
        }
        .build()
        return `_text-a-underline-fill`!!
    }

private var `_text-a-underline-fill`: ImageVector? = null
