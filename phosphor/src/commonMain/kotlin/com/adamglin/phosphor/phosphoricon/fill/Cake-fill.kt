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

public val FillGroup.`Cake-fill`: ImageVector
    get() {
        if (`_cake-fill` != null) {
            return `_cake-fill`!!
        }
        `_cake-fill` = Builder(name = "Cake-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 88.0f)
                lineTo(136.0f, 88.0f)
                lineTo(136.0f, 79.0f)
                arcToRelative(32.06f, 32.06f, 0.0f, false, false, 24.0f, -31.0f)
                curveToRelative(0.0f, -28.0f, -26.44f, -45.91f, -27.56f, -46.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.88f, 0.0f)
                curveTo(122.44f, 2.09f, 96.0f, 20.0f, 96.0f, 48.0f)
                arcToRelative(32.06f, 32.06f, 0.0f, false, false, 24.0f, 31.0f)
                verticalLineToRelative(9.0f)
                lineTo(48.0f, 88.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, 24.0f)
                verticalLineToRelative(23.33f)
                arcToRelative(40.84f, 40.84f, 0.0f, false, false, 8.0f, 24.24f)
                lineTo(32.0f, 200.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                lineTo(200.0f, 224.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                lineTo(224.0f, 159.57f)
                arcToRelative(40.84f, 40.84f, 0.0f, false, false, 8.0f, -24.24f)
                lineTo(232.0f, 112.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 208.0f, 88.0f)
                close()
                moveTo(112.0f, 48.0f)
                curveToRelative(0.0f, -13.57f, 10.0f, -24.46f, 16.0f, -29.79f)
                curveToRelative(6.0f, 5.33f, 16.0f, 16.22f, 16.0f, 29.79f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                close()
                moveTo(216.0f, 135.33f)
                curveToRelative(0.0f, 13.25f, -10.46f, 24.31f, -23.32f, 24.66f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 168.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.68f, 24.0f)
                curveTo(50.46f, 159.64f, 40.0f, 148.58f, 40.0f, 135.33f)
                lineTo(40.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(208.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
            }
        }
        .build()
        return `_cake-fill`!!
    }

private var `_cake-fill`: ImageVector? = null
