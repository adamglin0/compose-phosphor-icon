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

public val RegularGroup.SkipForwardCircle: ImageVector
    get() {
        if (_skipForwardCircle != null) {
            return _skipForwardCircle!!
        }
        _skipForwardCircle = Builder(name = "SkipForwardCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(160.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(25.57f)
                lineTo(100.24f, 81.22f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.24f, 6.78f)
                lineTo(152.0f, 142.43f)
                lineTo(152.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(168.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 80.0f)
                close()
                moveTo(104.0f, 153.57f)
                lineTo(104.0f, 102.43f)
                lineTo(144.91f, 128.0f)
                close()
            }
        }
        .build()
        return _skipForwardCircle!!
    }

private var _skipForwardCircle: ImageVector? = null
