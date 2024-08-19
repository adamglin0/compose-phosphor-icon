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

public val FillGroup.`Globe-x-fill`: ImageVector
    get() {
        if (`_globe-x-fill` != null) {
            return `_globe-x-fill`!!
        }
        `_globe-x-fill` = Builder(name = "Globe-x-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 0.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.0f, -14.21f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-1.12f, -0.91f, -20.88f, -17.32f, -31.06f, -49.77f)
                horizontalLineToRelative(26.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(98.08f, 152.02f)
                arcToRelative(140.17f, 140.17f, 0.0f, false, true, 0.0f, -48.0f)
                horizontalLineToRelative(59.88f)
                arcTo(138.0f, 138.0f, 0.0f, false, true, 160.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(154.7f, 154.7f, 0.0f, false, false, -1.84f, -24.0f)
                horizontalLineToRelative(38.51f)
                arcTo(87.61f, 87.61f, 0.0f, false, true, 216.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(102.0f, 88.0f)
                arcToRelative(115.11f, 115.11f, 0.0f, false, true, 26.0f, -45.0f)
                arcToRelative(115.27f, 115.27f, 0.0f, false, true, 26.0f, 45.0f)
                close()
                moveTo(170.75f, 88.0f)
                arcToRelative(135.28f, 135.28f, 0.0f, false, false, -22.3f, -45.6f)
                arcToRelative(88.29f, 88.29f, 0.0f, false, true, 58.0f, 45.6f)
                close()
                moveTo(221.7f, 173.66f)
                lineTo(203.31f, 192.0f)
                lineToRelative(18.35f, 18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(192.0f, 203.31f)
                lineToRelative(-18.34f, 18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(180.69f, 192.0f)
                lineToRelative(-18.35f, -18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(192.0f, 180.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                close()
            }
        }
        .build()
        return `_globe-x-fill`!!
    }

private var `_globe-x-fill`: ImageVector? = null
