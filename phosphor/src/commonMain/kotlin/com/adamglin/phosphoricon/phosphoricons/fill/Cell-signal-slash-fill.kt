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

public val FillGroup.`Cell-signal-slash-fill`: ImageVector
    get() {
        if (`_cell-signal-slash-fill` != null) {
            return `_cell-signal-slash-fill`!!
        }
        `_cell-signal-slash-fill` = Builder(name = "Cell-signal-slash-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.38f, 221.92f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, -0.54f)
                lineToRelative(-5.51f, -6.06f)
                arcTo(16.11f, 16.11f, 0.0f, false, true, 192.0f, 216.0f)
                horizontalLineTo(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -15.06f, -10.59f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, true, 4.07f, -17.0f)
                lineToRelative(79.13f, -79.12f)
                lineTo(42.26f, 45.62f)
                arcToRelative(8.22f, 8.22f, 0.0f, false, true, 0.14f, -11.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.48f, 0.37f)
                lineToRelative(160.0f, 176.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 213.38f, 221.92f)
                close()
                moveTo(201.0f, 172.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.0f, -2.69f)
                verticalLineTo(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -27.32f, -11.32f)
                lineToRelative(-55.21f, 55.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.13f, 5.52f)
                close()
            }
        }
        .build()
        return `_cell-signal-slash-fill`!!
    }

private var `_cell-signal-slash-fill`: ImageVector? = null
