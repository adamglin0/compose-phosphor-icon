package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Wheelchairmotion: ImageVector
    get() {
        if (_wheelchairmotion != null) {
            return _wheelchairmotion!!
        }
        _wheelchairmotion = Builder(name = "Wheelchairmotion", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 48.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 144.0f, 48.0f)
                close()
                moveTo(160.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -48.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 64.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 160.0f)
                close()
                moveTo(200.0f, 128.0f)
                lineTo(141.82f, 128.0f)
                lineToRelative(17.12f, -29.78f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.57f, -10.69f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 42.91f, 94.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 10.18f, 12.33f)
                arcToRelative(80.09f, 80.09f, 0.0f, false, true, 88.0f, -9.17f)
                lineTo(121.06f, 132.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 144.0f)
                horizontalLineToRelative(62.24f)
                lineToRelative(-14.08f, 70.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.27f, 9.41f)
                arcTo(7.77f, 7.77f, 0.0f, false, false, 184.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.83f, -6.43f)
                lineToRelative(16.0f, -80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 128.0f)
                close()
            }
        }
        .build()
        return _wheelchairmotion!!
    }

private var _wheelchairmotion: ImageVector? = null
