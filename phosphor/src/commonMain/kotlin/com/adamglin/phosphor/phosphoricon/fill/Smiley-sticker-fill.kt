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

public val FillGroup.`Smiley-sticker-fill`: ImageVector
    get() {
        if (`_smiley-sticker-fill` != null) {
            return `_smiley-sticker-fill`!!
        }
        `_smiley-sticker-fill` = Builder(name = "Smiley-sticker-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, true, false, 30.57f, 203.43f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 3.3f, -2.0f)
                lineToRelative(63.57f, -63.57f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.0f, -3.31f)
                arcTo(104.09f, 104.09f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(92.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 96.0f)
                close()
                moveTo(174.92f, 156.0f)
                curveToRelative(-10.29f, 17.79f, -27.39f, 28.0f, -46.92f, 28.0f)
                reflectiveCurveToRelative(-36.63f, -10.2f, -46.92f, -28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 13.84f, -8.0f)
                curveToRelative(7.47f, 12.91f, 19.21f, 20.0f, 33.08f, 20.0f)
                reflectiveCurveToRelative(25.61f, -7.1f, 33.08f, -20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 13.84f, 8.0f)
                close()
                moveTo(164.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 120.0f)
                close()
            }
        }
        .build()
        return `_smiley-sticker-fill`!!
    }

private var `_smiley-sticker-fill`: ImageVector? = null
