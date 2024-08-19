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

public val ThinGroup.Slidershorizontal: ImageVector
    get() {
        if (_slidershorizontal != null) {
            return _slidershorizontal!!
        }
        _slidershorizontal = Builder(name = "Slidershorizontal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.0f, 84.0f)
                lineTo(76.29f, 84.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 55.42f, 0.0f)
                lineTo(216.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(131.71f, 76.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -55.42f, 0.0f)
                lineTo(40.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(104.0f, 60.0f)
                arcTo(20.0f, 20.0f, 0.0f, true, true, 84.0f, 80.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 104.0f, 60.0f)
                close()
                moveTo(216.0f, 172.0f)
                lineTo(195.71f, 172.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -55.42f, 0.0f)
                lineTo(40.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(140.29f, 180.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 55.42f, 0.0f)
                lineTo(216.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(168.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 168.0f, 196.0f)
                close()
            }
        }
        .build()
        return _slidershorizontal!!
    }

private var _slidershorizontal: ImageVector? = null
