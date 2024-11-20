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

public val FillGroup.BracketsCurly: ImageVector
    get() {
        if (_bracketsCurly != null) {
            return _bracketsCurly!!
        }
        _bracketsCurly = Builder(name = "BracketsCurly", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                horizontalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(88.0f, 155.84f)
                curveToRelative(0.29f, 14.26f, 0.41f, 20.16f, 16.0f, 20.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                curveToRelative(-31.27f, 0.0f, -31.72f, -22.43f, -32.0f, -35.84f)
                curveTo(71.71f, 141.9f, 71.59f, 136.0f, 56.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                curveToRelative(15.59f, 0.0f, 15.71f, -5.9f, 16.0f, -20.16f)
                curveTo(72.28f, 86.43f, 72.73f, 64.0f, 104.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                curveToRelative(-15.59f, 0.0f, -15.71f, 5.9f, -16.0f, 20.16f)
                curveToRelative(-0.17f, 8.31f, -0.41f, 20.09f, -8.0f, 27.84f)
                curveTo(87.59f, 135.75f, 87.83f, 147.53f, 88.0f, 155.84f)
                close()
                moveTo(200.0f, 136.0f)
                curveToRelative(-15.59f, 0.0f, -15.71f, 5.9f, -16.0f, 20.16f)
                curveToRelative(-0.28f, 13.41f, -0.73f, 35.84f, -32.0f, 35.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                curveToRelative(15.59f, 0.0f, 15.71f, -5.9f, 16.0f, -20.16f)
                curveToRelative(0.17f, -8.31f, 0.41f, -20.09f, 8.0f, -27.84f)
                curveToRelative(-7.6f, -7.75f, -7.84f, -19.53f, -8.0f, -27.84f)
                curveTo(167.71f, 85.9f, 167.59f, 80.0f, 152.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                curveToRelative(31.27f, 0.0f, 31.72f, 22.43f, 32.0f, 35.84f)
                curveToRelative(0.29f, 14.26f, 0.41f, 20.16f, 16.0f, 20.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return _bracketsCurly!!
    }

private var _bracketsCurly: ImageVector? = null
