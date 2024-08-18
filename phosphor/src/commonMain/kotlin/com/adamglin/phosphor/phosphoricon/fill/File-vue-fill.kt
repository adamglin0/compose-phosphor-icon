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

public val FillGroup.`File-vue-fill`: ImageVector
    get() {
        if (`_file-vue-fill` != null) {
            return `_file-vue-fill`!!
        }
        `_file-vue-fill` = Builder(name = "File-vue-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.66f, 82.34f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 24.0f)
                horizontalLineToRelative(-96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(212.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(216.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 213.66f, 82.34f)
                close()
                moveTo(152.0f, 88.0f)
                lineTo(152.0f, 44.0f)
                lineToRelative(44.0f, 44.0f)
                close()
                moveTo(87.36f, 155.0f)
                lineTo(67.47f, 210.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.08f, 0.0f)
                lineTo(32.5f, 155.0f)
                arcTo(8.21f, 8.21f, 0.0f, false, true, 37.0f, 144.55f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.46f, 4.76f)
                lineToRelative(12.47f, 34.9f)
                lineToRelative(12.47f, -34.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.46f, -4.76f)
                arcTo(8.22f, 8.22f, 0.0f, false, true, 87.36f, 155.0f)
                close()
                moveTo(184.0f, 160.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(15.73f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, true, 8.26f, 7.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.53f)
                lineTo(184.0f, 188.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(23.73f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, 8.26f, 7.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.53f)
                lineTo(176.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(168.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(31.74f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, 8.26f, 7.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.53f)
                close()
                moveTo(152.0f, 152.0f)
                verticalLineToRelative(37.45f)
                curveToRelative(0.0f, 14.14f, -11.07f, 26.12f, -25.22f, 26.54f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 100.0f, 190.0f)
                lineTo(100.0f, 152.27f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, 7.47f, -8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.54f, 8.0f)
                verticalLineToRelative(37.65f)
                arcTo(10.23f, 10.23f, 0.0f, false, false, 125.27f, 200.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 136.0f, 190.0f)
                lineTo(136.0f, 152.27f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, 7.47f, -8.25f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 152.0f)
                close()
            }
        }
        .build()
        return `_file-vue-fill`!!
    }

private var `_file-vue-fill`: ImageVector? = null
