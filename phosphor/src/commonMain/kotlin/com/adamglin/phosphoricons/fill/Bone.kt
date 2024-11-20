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

public val FillGroup.Bone: ImageVector
    get() {
        if (_bone != null) {
            return _bone!!
        }
        _bone = Builder(name = "Bone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.12f, 107.72f)
                arcToRelative(35.91f, 35.91f, 0.0f, false, true, -46.19f, 6.8f)
                arcToRelative(0.14f, 0.14f, 0.0f, false, false, -0.1f, 0.0f)
                lineToRelative(-70.35f, 70.36f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.08f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -66.37f, 22.92f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 22.92f, -66.37f)
                arcToRelative(0.14f, 0.14f, 0.0f, false, false, 0.1f, 0.0f)
                lineToRelative(70.35f, -70.36f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, -0.08f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 66.37f, -22.92f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 23.27f, 59.57f)
                close()
            }
        }
        .build()
        return _bone!!
    }

private var _bone: ImageVector? = null
