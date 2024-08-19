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

public val BoldGroup.Courtbasketball: ImageVector
    get() {
        if (_courtbasketball != null) {
            return _courtbasketball!!
        }
        _courtbasketball = Builder(name = "Courtbasketball", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 44.0f)
                lineTo(32.0f, 44.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 12.0f, 64.0f)
                lineTo(12.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(224.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(244.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 224.0f, 44.0f)
                close()
                moveTo(220.0f, 156.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, -56.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(36.0f, 100.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 56.0f)
                lineTo(36.0f, 156.0f)
                close()
                moveTo(36.0f, 180.0f)
                horizontalLineToRelative(4.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 40.0f, 76.0f)
                lineTo(36.0f, 76.0f)
                lineTo(36.0f, 68.0f)
                horizontalLineToRelative(80.0f)
                lineTo(116.0f, 188.0f)
                lineTo(36.0f, 188.0f)
                close()
                moveTo(140.0f, 188.0f)
                lineTo(140.0f, 68.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, 104.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _courtbasketball!!
    }

private var _courtbasketball: ImageVector? = null
