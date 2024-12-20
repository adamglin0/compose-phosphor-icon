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

public val FillGroup.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) {
            return _forkKnife!!
        }
        _forkKnife = Builder(name = "ForkKnife", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                lineTo(216.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(200.0f, 176.0f)
                lineTo(152.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                arcToRelative(268.75f, 268.75f, 0.0f, false, true, 7.22f, -56.88f)
                curveToRelative(9.78f, -40.49f, 28.32f, -67.63f, 53.63f, -78.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 40.0f)
                close()
                moveTo(119.89f, 38.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.78f, 2.63f)
                lineTo(111.89f, 88.0f)
                lineTo(88.0f, 88.0f)
                lineTo(88.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(72.0f, 88.0f)
                lineTo(48.11f, 88.0f)
                lineToRelative(7.78f, -46.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.78f, -2.63f)
                lineToRelative(-8.0f, 48.0f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 32.0f, 88.0f)
                arcToRelative(48.07f, 48.07f, 0.0f, false, false, 40.0f, 47.32f)
                lineTo(72.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(88.0f, 135.32f)
                arcTo(48.07f, 48.07f, 0.0f, false, false, 128.0f, 88.0f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, -0.11f, -1.31f)
                close()
            }
        }
        .build()
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
