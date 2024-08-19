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

public val FillGroup.`Smiley-angry-fill`: ImageVector
    get() {
        if (`_smiley-angry-fill` != null) {
            return `_smiley-angry-fill`!!
        }
        `_smiley-angry-fill` = Builder(name = "Smiley-angry-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(80.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 140.0f)
                close()
                moveTo(158.66f, 188.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.09f, 2.23f)
                curveTo(141.07f, 186.34f, 136.0f, 184.0f, 128.0f, 184.0f)
                reflectiveCurveToRelative(-13.07f, 2.34f, -19.57f, 6.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.86f, -13.32f)
                curveTo(108.0f, 171.73f, 116.06f, 168.0f, 128.0f, 168.0f)
                reflectiveCurveToRelative(20.0f, 3.73f, 28.43f, 9.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 158.66f, 188.43f)
                close()
                moveTo(164.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 152.0f)
                close()
                moveTo(180.44f, 94.66f)
                lineTo(132.44f, 126.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.88f, 0.0f)
                lineToRelative(-48.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.88f, -13.32f)
                lineTo(128.0f, 110.39f)
                lineToRelative(43.56f, -29.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.88f, 13.32f)
                close()
            }
        }
        .build()
        return `_smiley-angry-fill`!!
    }

private var `_smiley-angry-fill`: ImageVector? = null
