package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Chartbarhorizontal: ImageVector
    get() {
        if (_chartbarhorizontal != null) {
            return _chartbarhorizontal!!
        }
        _chartbarhorizontal = Builder(name = "Chartbarhorizontal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 100.0f)
                lineTo(180.0f, 100.0f)
                lineTo(180.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(52.0f, 52.0f)
                lineTo(52.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(44.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(52.0f, 204.0f)
                horizontalLineToRelative(92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(148.0f, 156.0f)
                horizontalLineToRelative(76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(228.0f, 104.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 100.0f)
                close()
                moveTo(172.0f, 60.0f)
                verticalLineToRelative(40.0f)
                lineTo(52.0f, 100.0f)
                lineTo(52.0f, 60.0f)
                close()
                moveTo(140.0f, 196.0f)
                lineTo(52.0f, 196.0f)
                lineTo(52.0f, 156.0f)
                horizontalLineToRelative(88.0f)
                close()
                moveTo(220.0f, 148.0f)
                lineTo(52.0f, 148.0f)
                lineTo(52.0f, 108.0f)
                lineTo(220.0f, 108.0f)
                close()
            }
        }
        .build()
        return _chartbarhorizontal!!
    }

private var _chartbarhorizontal: ImageVector? = null
