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

public val FillGroup.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) {
            return _babyCarriage!!
        }
        _babyCarriage = Builder(name = "BabyCarriage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.58f, 54.55f)
                arcToRelative(7.53f, 7.53f, 0.0f, false, false, -1.32f, -1.27f)
                arcTo(79.68f, 79.68f, 0.0f, false, false, 160.0f, 32.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(56.0f)
                lineTo(55.2f, 104.0f)
                arcTo(40.07f, 40.07f, 0.0f, false, false, 16.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                arcToRelative(80.09f, 80.09f, 0.0f, false, false, 80.0f, 80.0f)
                horizontalLineToRelative(40.0f)
                arcTo(79.94f, 79.94f, 0.0f, false, false, 215.58f, 54.55f)
                close()
                moveTo(208.67f, 70.55f)
                arcTo(63.73f, 63.73f, 0.0f, false, true, 223.48f, 104.0f)
                lineTo(166.81f, 104.0f)
                close()
                moveTo(160.0f, 48.0f)
                arcToRelative(63.59f, 63.59f, 0.0f, false, true, 36.69f, 11.61f)
                lineTo(152.0f, 95.35f)
                lineTo(152.0f, 48.0f)
                close()
                moveTo(104.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 104.0f, 224.0f)
                close()
                moveTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 208.0f, 224.0f)
                close()
            }
        }
        .build()
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
