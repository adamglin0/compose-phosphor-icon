package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Behance-logo-light`: ImageVector
    get() {
        if (`_behance-logo-light` != null) {
            return `_behance-logo-light`!!
        }
        `_behance-logo-light` = Builder(name = "Behance-logo-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.15f, 122.36f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 90.0f, 58.0f)
                lineTo(32.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(26.0f, 192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(94.0f, 198.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 18.15f, -75.64f)
                close()
                moveTo(38.0f, 70.0f)
                lineTo(90.0f, 70.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 48.0f)
                lineTo(38.0f, 118.0f)
                close()
                moveTo(94.0f, 186.0f)
                lineTo(38.0f, 186.0f)
                lineTo(38.0f, 130.0f)
                lineTo(94.0f, 130.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 56.0f)
                close()
                moveTo(162.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(168.0f, 86.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 162.0f, 80.0f)
                close()
                moveTo(200.0f, 106.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, 36.8f, 73.61f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.6f, -7.21f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 166.53f, 158.0f)
                lineTo(240.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                arcTo(46.06f, 46.06f, 0.0f, false, false, 200.0f, 106.0f)
                close()
                moveTo(166.53f, 146.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 66.94f, 0.0f)
                close()
            }
        }
        .build()
        return `_behance-logo-light`!!
    }

private var `_behance-logo-light`: ImageVector? = null
