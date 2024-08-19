package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Wheelchairmotion: ImageVector
    get() {
        if (_wheelchairmotion != null) {
            return _wheelchairmotion!!
        }
        _wheelchairmotion = Builder(name = "Wheelchairmotion", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 78.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -30.0f, -30.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 176.0f, 78.0f)
                close()
                moveTo(176.0f, 30.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 176.0f, 30.0f)
                close()
                moveTo(166.0f, 168.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, true, true, -62.0f, -62.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, true, false, 50.0f, 50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(204.64f, 132.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.24f, 5.0f)
                lineToRelative(-16.0f, 80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 184.0f, 222.0f)
                arcToRelative(6.08f, 6.08f, 0.0f, false, true, -1.19f, -0.12f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.7f, -7.06f)
                lineTo(192.68f, 142.0f)
                lineTo(128.0f, 142.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.2f, -9.0f)
                lineToRelative(21.07f, -36.68f)
                arcToRelative(82.05f, 82.05f, 0.0f, false, false, -92.05f, 8.41f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -7.64f, -9.25f)
                arcToRelative(94.0f, 94.0f, 0.0f, false, true, 111.1f, -6.28f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.92f, 8.0f)
                lineTo(138.37f, 130.0f)
                lineTo(200.0f, 130.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 204.64f, 132.2f)
                close()
            }
        }
        .build()
        return _wheelchairmotion!!
    }

private var _wheelchairmotion: ImageVector? = null
