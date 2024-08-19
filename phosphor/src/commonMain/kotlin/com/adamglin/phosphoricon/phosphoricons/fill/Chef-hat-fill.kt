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

public val FillGroup.`Chef-hat-fill`: ImageVector
    get() {
        if (`_chef-hat-fill` != null) {
            return `_chef-hat-fill`!!
        }
        `_chef-hat-fill` = Builder(name = "Chef-hat-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 112.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, -56.0f)
                curveToRelative(-1.77f, 0.0f, -3.54f, 0.1f, -5.29f, 0.26f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -101.42f, 0.0f)
                curveTo(75.54f, 56.1f, 73.77f, 56.0f, 72.0f, 56.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 48.0f, 162.59f)
                lineTo(48.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(192.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(208.0f, 162.59f)
                arcTo(56.09f, 56.09f, 0.0f, false, false, 240.0f, 112.0f)
                close()
                moveTo(152.24f, 142.06f)
                lineTo(160.24f, 110.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.52f, 3.88f)
                lineToRelative(-8.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 152.0f)
                arcToRelative(8.13f, 8.13f, 0.0f, false, true, -1.95f, -0.24f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.24f, 142.06f)
                close()
                moveTo(120.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(86.06f, 104.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.7f, 5.82f)
                lineToRelative(8.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.82f, 9.7f)
                arcToRelative(8.13f, 8.13f, 0.0f, false, true, -2.0f, 0.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.75f, -6.06f)
                lineToRelative(-8.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 86.06f, 104.24f)
                close()
                moveTo(192.0f, 208.0f)
                lineTo(64.0f, 208.0f)
                lineTo(64.0f, 167.42f)
                arcToRelative(55.49f, 55.49f, 0.0f, false, false, 8.0f, 0.58f)
                lineTo(184.0f, 168.0f)
                arcToRelative(55.49f, 55.49f, 0.0f, false, false, 8.0f, -0.58f)
                close()
            }
        }
        .build()
        return `_chef-hat-fill`!!
    }

private var `_chef-hat-fill`: ImageVector? = null
