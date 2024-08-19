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

public val FillGroup.`Bluetooth-slash-fill`: ImageVector
    get() {
        if (`_bluetooth-slash-fill` != null) {
            return `_bluetooth-slash-fill`!!
        }
        `_bluetooth-slash-fill` = Builder(name = "Bluetooth-slash-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.38f, 221.92f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, -0.54f)
                lineToRelative(-26.45f, -29.1f)
                lineTo(132.8f, 230.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.89f, 0.47f)
                arcToRelative(8.29f, 8.29f, 0.0f, false, true, -3.91f, -7.18f)
                verticalLineTo(144.0f)
                lineTo(68.8f, 182.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.16f, -1.55f)
                arcToRelative(8.26f, 8.26f, 0.0f, false, true, 1.81f, -11.43f)
                lineToRelative(61.47f, -46.11f)
                lineTo(50.08f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 61.92f, 34.62f)
                lineToRelative(160.0f, 176.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 221.38f, 221.92f)
                close()
                moveTo(155.0f, 113.22f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.36f, 0.51f)
                lineTo(196.8f, 86.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -12.8f)
                lineToRelative(-64.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.0f, 0.29f)
                arcTo(8.25f, 8.25f, 0.0f, false, false, 120.0f, 32.24f)
                verticalLineTo(73.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.0f, 2.69f)
                close()
            }
        }
        .build()
        return `_bluetooth-slash-fill`!!
    }

private var `_bluetooth-slash-fill`: ImageVector? = null
