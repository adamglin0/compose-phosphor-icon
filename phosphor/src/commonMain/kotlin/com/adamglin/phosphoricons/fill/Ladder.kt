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

public val FillGroup.Ladder: ImageVector
    get() {
        if (_ladder != null) {
            return _ladder!!
        }
        _ladder = Builder(name = "Ladder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.52f, 213.26f)
                lineTo(164.51f, 73.0f)
                lineToRelative(9.09f, -25.0f)
                lineTo(184.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(88.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(4.58f)
                lineTo(32.48f, 213.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.79f, 10.26f)
                arcTo(8.14f, 8.14f, 0.0f, false, false, 40.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.52f, -5.27f)
                lineTo(57.24f, 192.0f)
                horizontalLineToRelative(47.0f)
                lineToRelative(-7.74f, 21.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.79f, 10.26f)
                arcTo(8.14f, 8.14f, 0.0f, false, false, 104.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.52f, -5.27f)
                lineTo(130.0f, 168.0f)
                lineTo(182.0f, 168.0f)
                lineToRelative(18.45f, 50.73f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 224.0f)
                arcToRelative(8.14f, 8.14f, 0.0f, false, false, 2.73f, -0.48f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 215.52f, 213.26f)
                close()
                moveTo(109.39f, 64.0f)
                horizontalLineToRelative(30.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(109.39f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, -16.0f)
                close()
                moveTo(110.25f, 160.0f)
                lineTo(80.3f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(30.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(124.79f, 120.0f)
                lineTo(94.84f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(30.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(135.79f, 152.0f)
                lineTo(156.0f, 96.41f)
                lineTo(176.21f, 152.0f)
                close()
            }
        }
        .build()
        return _ladder!!
    }

private var _ladder: ImageVector? = null
