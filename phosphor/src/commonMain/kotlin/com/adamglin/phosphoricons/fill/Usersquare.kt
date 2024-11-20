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

public val FillGroup.UserSquare: ImageVector
    get() {
        if (_userSquare != null) {
            return _userSquare!!
        }
        _userSquare = Builder(name = "UserSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 120.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, -44.0f, -44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 172.0f, 120.0f)
                close()
                moveTo(224.0f, 48.0f)
                lineTo(224.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f)
                lineTo(208.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(208.0f, 48.0f)
                lineTo(48.0f, 48.0f)
                lineTo(48.0f, 208.0f)
                horizontalLineToRelative(3.67f)
                arcToRelative(80.58f, 80.58f, 0.0f, false, true, 26.07f, -38.25f)
                quadToRelative(3.08f, -2.48f, 6.36f, -4.62f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.81f, 0.33f)
                arcToRelative(59.82f, 59.82f, 0.0f, false, false, 78.18f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.81f, -0.33f)
                quadToRelative(3.28f, 2.15f, 6.36f, 4.62f)
                arcTo(80.58f, 80.58f, 0.0f, false, true, 204.33f, 208.0f)
                lineTo(208.0f, 208.0f)
                close()
            }
        }
        .build()
        return _userSquare!!
    }

private var _userSquare: ImageVector? = null
