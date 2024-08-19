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

public val DuotoneGroup.`Lightning-slash-duotone`: ImageVector
    get() {
        if (`_lightning-slash-duotone` != null) {
            return `_lightning-slash-duotone`!!
        }
        `_lightning-slash-duotone` = Builder(name = "Lightning-slash-duotone", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(96.0f, 240.0f)
                lineToRelative(16.0f, -80.0f)
                lineTo(48.0f, 136.0f)
                lineTo(160.0f, 16.0f)
                lineTo(144.0f, 96.0f)
                lineToRelative(64.0f, 24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(81.33f, 88.56f)
                lineToRelative(-39.18f, 42.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.0f, 13.0f)
                lineToRelative(57.63f, 21.61f)
                lineTo(88.16f, 238.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.69f, 7.0f)
                lineToRelative(61.86f, -66.28f)
                lineToRelative(38.37f, 42.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(109.37f, 214.0f)
                lineToRelative(10.47f, -52.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.0f, -9.06f)
                lineTo(62.0f, 132.71f)
                lineToRelative(30.12f, -32.27f)
                lineToRelative(60.78f, 66.86f)
                close()
                moveTo(108.66f, 71.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.39f, -11.31f)
                lineToRelative(45.88f, -49.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.69f, 7.0f)
                lineTo(153.18f, 90.9f)
                lineToRelative(57.63f, 21.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.0f, 12.95f)
                lineToRelative(-22.3f, 23.89f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.7f, -10.91f)
                lineTo(194.0f, 123.29f)
                lineToRelative(-52.8f, -19.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.0f, -9.06f)
                lineToRelative(10.47f, -52.38f)
                lineTo(120.0f, 70.62f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 108.66f, 71.0f)
                close()
            }
        }
        .build()
        return `_lightning-slash-duotone`!!
    }

private var `_lightning-slash-duotone`: ImageVector? = null
