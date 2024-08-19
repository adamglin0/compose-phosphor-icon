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

public val FillGroup.`Gender-nonbinary-fill`: ImageVector
    get() {
        if (`_gender-nonbinary-fill` != null) {
            return `_gender-nonbinary-fill`!!
        }
        `_gender-nonbinary-fill` = Builder(name = "Gender-nonbinary-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 24.0f)
                close()
                moveTo(128.0f, 208.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -8.0f, -103.38f)
                lineTo(120.0f, 83.82f)
                lineTo(91.0f, 95.43f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 85.0f, 80.57f)
                lineTo(106.46f, 72.0f)
                lineTo(85.0f, 63.43f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 91.0f, 48.57f)
                lineToRelative(37.0f, 14.81f)
                lineToRelative(37.0f, -14.81f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 171.0f, 63.43f)
                lineTo(149.54f, 72.0f)
                lineTo(171.0f, 80.57f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 165.0f, 95.43f)
                lineTo(136.0f, 83.82f)
                verticalLineToRelative(20.8f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 128.0f, 208.0f)
                close()
                moveTo(164.0f, 156.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 164.0f, 156.0f)
                close()
            }
        }
        .build()
        return `_gender-nonbinary-fill`!!
    }

private var `_gender-nonbinary-fill`: ImageVector? = null
