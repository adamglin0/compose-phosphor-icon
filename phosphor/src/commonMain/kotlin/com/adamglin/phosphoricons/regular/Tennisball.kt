package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) {
            return _tennisBall!!
        }
        _tennisBall = Builder(name = "TennisBall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.57f, 54.46f)
                arcToRelative(104.0f, 104.0f, 0.0f, true, false, 0.0f, 147.08f)
                arcTo(103.4f, 103.4f, 0.0f, false, false, 201.57f, 54.46f)
                close()
                moveTo(65.75f, 65.77f)
                arcToRelative(87.63f, 87.63f, 0.0f, false, true, 53.66f, -25.31f)
                arcTo(87.31f, 87.31f, 0.0f, false, true, 94.0f, 94.06f)
                arcToRelative(87.42f, 87.42f, 0.0f, false, true, -53.62f, 25.35f)
                arcTo(87.58f, 87.58f, 0.0f, false, true, 65.75f, 65.77f)
                close()
                moveTo(40.33f, 135.48f)
                arcToRelative(103.29f, 103.29f, 0.0f, false, false, 65.0f, -30.11f)
                arcToRelative(103.24f, 103.24f, 0.0f, false, false, 30.13f, -65.0f)
                arcToRelative(87.78f, 87.78f, 0.0f, false, true, 80.18f, 80.14f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, -95.16f, 95.1f)
                arcToRelative(87.78f, 87.78f, 0.0f, false, true, -80.18f, -80.14f)
                close()
                moveTo(190.25f, 190.23f)
                arcToRelative(87.69f, 87.69f, 0.0f, false, true, -53.66f, 25.31f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 79.0f, -78.95f)
                arcTo(87.58f, 87.58f, 0.0f, false, true, 190.25f, 190.23f)
                close()
            }
        }
        .build()
        return _tennisBall!!
    }

private var _tennisBall: ImageVector? = null
