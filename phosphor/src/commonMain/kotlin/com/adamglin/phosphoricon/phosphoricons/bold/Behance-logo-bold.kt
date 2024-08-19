package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Behance-logo-bold`: ImageVector
    get() {
        if (`_behance-logo-bold` != null) {
            return `_behance-logo-bold`!!
        }
        `_behance-logo-bold` = Builder(name = "Behance-logo-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(117.82f, 121.39f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 86.0f, 52.0f)
                lineTo(32.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 64.0f)
                lineTo(20.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(90.0f, 204.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 27.82f, -82.61f)
                close()
                moveTo(44.0f, 76.0f)
                lineTo(86.0f, 76.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.0f, 36.0f)
                lineTo(44.0f, 112.0f)
                close()
                moveTo(90.0f, 180.0f)
                lineTo(44.0f, 180.0f)
                lineTo(44.0f, 136.0f)
                lineTo(90.0f, 136.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 0.0f, 44.0f)
                close()
                moveTo(156.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(168.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 156.0f, 76.0f)
                close()
                moveTo(200.0f, 100.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, 104.0f)
                arcToRelative(51.45f, 51.45f, 0.0f, false, false, 22.7f, -5.21f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -10.49f, -21.58f)
                arcTo(27.73f, 27.73f, 0.0f, false, true, 200.0f, 180.0f)
                arcToRelative(28.05f, 28.05f, 0.0f, false, true, -25.3f, -16.0f)
                lineTo(240.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, false, 200.0f, 100.0f)
                close()
                moveTo(174.7f, 140.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 50.6f, 0.0f)
                close()
            }
        }
        .build()
        return `_behance-logo-bold`!!
    }

private var `_behance-logo-bold`: ImageVector? = null
