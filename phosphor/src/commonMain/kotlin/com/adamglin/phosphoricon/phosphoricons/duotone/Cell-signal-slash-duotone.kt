package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Cell-signal-slash-duotone`: ImageVector
    get() {
        if (`_cell-signal-slash-duotone` != null) {
            return `_cell-signal-slash-duotone`!!
        }
        `_cell-signal-slash-duotone` = Builder(name = "Cell-signal-slash-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 40.0f)
                verticalLineTo(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -13.66f)
                lineToRelative(160.0f, -160.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.92f, 210.62f)
                lineToRelative(-160.0f, -176.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.07f, 45.38f)
                lineToRelative(58.07f, 63.86f)
                lineTo(20.69f, 188.68f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 216.0f)
                horizontalLineTo(192.0f)
                arcToRelative(16.13f, 16.13f, 0.0f, false, false, 4.56f, -0.68f)
                lineToRelative(5.52f, 6.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(32.0f, 200.0f)
                lineToRelative(78.9f, -78.89f)
                lineTo(182.64f, 200.0f)
                close()
                moveTo(128.18f, 92.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.31f)
                lineToRelative(52.51f, -52.5f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 208.0f, 40.0f)
                verticalLineTo(159.63f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(40.0f)
                lineTo(139.5f, 92.51f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.18f, 92.51f)
                close()
            }
        }
        .build()
        return `_cell-signal-slash-duotone`!!
    }

private var `_cell-signal-slash-duotone`: ImageVector? = null
