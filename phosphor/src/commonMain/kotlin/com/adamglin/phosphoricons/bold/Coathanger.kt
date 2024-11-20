package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.CoatHanger: ImageVector
    get() {
        if (_coatHanger != null) {
            return _coatHanger!!
        }
        _coatHanger = Builder(name = "CoatHanger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 168.0f)
                lineTo(148.0f, 96.0f)
                lineToRelative(19.2f, -14.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 172.0f, 72.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -87.66f, -5.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 23.82f, 3.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 39.09f, -2.92f)
                lineTo(121.0f, 86.24f)
                curveToRelative(-0.15f, 0.1f, -0.29f, 0.21f, -0.43f, 0.32f)
                lineTo(12.0f, 168.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 12.0f, 36.0f)
                horizontalLineTo(232.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 12.0f, -36.0f)
                close()
                moveTo(36.0f, 180.0f)
                lineToRelative(92.0f, -69.0f)
                lineToRelative(92.0f, 69.0f)
                close()
            }
        }
        .build()
        return _coatHanger!!
    }

private var _coatHanger: ImageVector? = null
