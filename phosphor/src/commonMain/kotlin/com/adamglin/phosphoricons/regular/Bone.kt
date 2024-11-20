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

public val RegularGroup.Bone: ImageVector
    get() {
        if (_bone != null) {
            return _bone!!
        }
        _bone = Builder(name = "Bone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.67f, 60.89f)
                arcToRelative(35.82f, 35.82f, 0.0f, false, false, -23.82f, -12.74f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -66.37f, 22.92f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, 0.08f)
                lineTo(71.17f, 141.51f)
                reflectiveCurveToRelative(0.0f, 0.0f, -0.1f, 0.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -22.92f, 66.37f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 66.37f, -22.92f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, 0.0f, -0.08f)
                lineToRelative(70.35f, -70.36f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.1f, 0.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 46.74f, -53.63f)
                close()
                moveTo(219.1f, 97.16f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -25.67f, 3.8f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -19.88f, 2.19f)
                lineToRelative(-70.4f, 70.4f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 101.0f, 193.43f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -36.75f, 7.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.91f, -9.24f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -1.23f, 0.1f)
                arcTo(20.0f, 20.0f, 0.0f, true, true, 62.57f, 155.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 19.88f, -2.19f)
                lineToRelative(70.4f, -70.4f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 155.0f, 62.57f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 36.75f, -7.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.14f, 9.14f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 18.17f, 33.0f)
                close()
            }
        }
        .build()
        return _bone!!
    }

private var _bone: ImageVector? = null
