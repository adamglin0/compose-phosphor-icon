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

public val FillGroup.`Arrows-out-simple-fill`: ImageVector
    get() {
        if (`_arrows-out-simple-fill` != null) {
            return `_arrows-out-simple-fill`!!
        }
        `_arrows-out-simple-fill` = Builder(name = "Arrows-out-simple-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(117.66f, 138.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineTo(83.31f, 184.0f)
                lineToRelative(18.35f, 18.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 216.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f)
                lineTo(72.0f, 172.69f)
                lineToRelative(34.34f, -34.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 117.66f, 138.34f)
                close()
                moveTo(208.0f, 40.0f)
                horizontalLineTo(160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                lineTo(172.69f, 72.0f)
                lineToRelative(-34.35f, 34.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineTo(184.0f, 83.31f)
                lineToRelative(18.34f, 18.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 96.0f)
                verticalLineTo(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 40.0f)
                close()
            }
        }
        .build()
        return `_arrows-out-simple-fill`!!
    }

private var `_arrows-out-simple-fill`: ImageVector? = null
