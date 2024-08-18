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

public val FillGroup.`Van-fill`: ImageVector
    get() {
        if (`_van-fill` != null) {
            return `_van-fill`!!
        }
        `_van-fill` = Builder(name = "Van-fill", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(254.07f, 106.79f)
                lineTo(208.53f, 53.73f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 196.26f, 48.0f)
                lineTo(32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 64.0f)
                lineTo(16.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(49.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 62.0f, 0.0f)
                horizontalLineToRelative(50.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 62.0f, 0.0f)
                horizontalLineToRelative(17.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(256.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 254.07f, 106.79f)
                close()
                moveTo(32.0f, 104.0f)
                lineTo(32.0f, 64.0f)
                lineTo(88.0f, 64.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(80.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 80.0f, 200.0f)
                close()
                moveTo(160.0f, 104.0f)
                lineTo(104.0f, 104.0f)
                lineTo(104.0f, 64.0f)
                horizontalLineToRelative(56.0f)
                close()
                moveTo(192.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 192.0f, 200.0f)
                close()
                moveTo(176.0f, 104.0f)
                lineTo(176.0f, 64.0f)
                horizontalLineToRelative(20.26f)
                lineToRelative(34.33f, 40.0f)
                close()
            }
        }
        .build()
        return `_van-fill`!!
    }

private var `_van-fill`: ImageVector? = null
