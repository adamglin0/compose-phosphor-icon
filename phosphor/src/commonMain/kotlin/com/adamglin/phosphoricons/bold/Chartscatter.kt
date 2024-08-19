package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Chartscatter: ImageVector
    get() {
        if (_chartscatter != null) {
            return _chartscatter!!
        }
        _chartscatter = Builder(name = "Chartscatter", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(32.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(20.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(44.0f, 196.0f)
                lineTo(224.0f, 196.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 208.0f)
                close()
                moveTo(116.0f, 148.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 116.0f, 148.0f)
                close()
                moveTo(108.0f, 108.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, false, 92.0f, 92.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 108.0f, 108.0f)
                close()
                moveTo(76.0f, 180.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 76.0f, 180.0f)
                close()
                moveTo(172.0f, 132.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 172.0f, 132.0f)
                close()
                moveTo(196.0f, 92.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 196.0f, 92.0f)
                close()
                moveTo(172.0f, 164.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 172.0f, 164.0f)
                close()
            }
        }
        .build()
        return _chartscatter!!
    }

private var _chartscatter: ImageVector? = null
