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

public val DuotoneGroup.`Cell-signal-low-duotone`: ImageVector
    get() {
        if (`_cell-signal-low-duotone` != null) {
            return `_cell-signal-low-duotone`!!
        }
        `_cell-signal-low-duotone` = Builder(name = "Cell-signal-low-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(80.0f, 140.7f)
                verticalLineTo(208.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -13.66f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.12f, 25.23f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -17.44f, 3.46f)
                lineToRelative(-160.0f, 160.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 216.0f)
                lineTo(192.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(208.0f, 40.0f)
                arcTo(15.94f, 15.94f, 0.0f, false, false, 198.12f, 25.23f)
                close()
                moveTo(72.0f, 160.0f)
                verticalLineToRelative(40.0f)
                lineTo(32.0f, 200.0f)
                close()
                moveTo(192.0f, 200.0f)
                lineTo(88.0f, 200.0f)
                lineTo(88.0f, 144.0f)
                lineTo(192.0f, 40.0f)
                close()
            }
        }
        .build()
        return `_cell-signal-low-duotone`!!
    }

private var `_cell-signal-low-duotone`: ImageVector? = null
